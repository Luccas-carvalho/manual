package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objsuarioDTO.getEmail_usuario());
            pstm.setString(2, objsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e);
            return null;
        }
    }

    public int obterIdUsuario(UsuarioDTO usuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT id FROM usuario WHERE email = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioDTO.getEmail_usuario());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e);
            return -1;
        }
    }

}

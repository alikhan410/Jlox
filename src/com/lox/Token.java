package src.com.lox;

public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return String.format("Token[type=%s, lexeme=%s, literal=%s]",
                type != null ? type : "null",
                lexeme != null ? lexeme : "null",
                literal != null ? literal : "null");
    }

}

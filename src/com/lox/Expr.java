package src.com.lox;


abstract class Expr {
    static class Binary extends Expr {
        final Expr left;
        final Token operator;
        final Expr right;

        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

    }

    static class Unary extends Expr {
        final Expr left;
        final Token operator;

        Unary(Token operator, Expr left) {
            this.left = left;
            this.operator = operator;
        }

    }

    static class Grouping extends Expr {
        final Expr expression;

        Grouping(Expr expr) {
            this.expression = expr;
        }

    }

    static class Literal extends Expr {
        final Object value;

        Literal(Object value) {
            this.value = value;
        }
    }
}
package blanco.commons.sql.format.valueobject;

/**
 * blancoSqlFormatterで利用されるトークンをあらわすバリューオブジェクト。
 */
public class AbstractBlancoSqlToken {
    /**
     * トークン種別をあらわします。
     *
     * フィールド: [type]。
     */
    private int fType;

    /**
     * トークンの実際の文字列をあらわします。
     *
     * フィールド: [string]。
     */
    private String fString;

    /**
     * 予約語、コメント、値などのトークンの位置をあらわすフィールド。ソース文字列の先頭からの位置をあらわします。値は ゼロ(ZERO)オリジンです。デフォルト値は (-1)で、(-1) の場合には「位置情報に意味がない」ことをあらわします。
     *
     * フィールド: [pos]。
     * デフォルト: [-1]。
     */
    private int fPos = -1;

    /**
     * フィールド [type] の値を設定します。
     *
     * フィールドの説明: [トークン種別をあらわします。]。
     *
     * @param argType フィールド[type]に設定する値。
     */
    public void setType(final int argType) {
        fType = argType;
    }

    /**
     * フィールド [type] の値を取得します。
     *
     * フィールドの説明: [トークン種別をあらわします。]。
     *
     * @return フィールド[type]から取得した値。
     */
    public int getType() {
        return fType;
    }

    /**
     * フィールド [string] の値を設定します。
     *
     * フィールドの説明: [トークンの実際の文字列をあらわします。]。
     *
     * @param argString フィールド[string]に設定する値。
     */
    public void setString(final String argString) {
        fString = argString;
    }

    /**
     * フィールド [string] の値を取得します。
     *
     * フィールドの説明: [トークンの実際の文字列をあらわします。]。
     *
     * @return フィールド[string]から取得した値。
     */
    public String getString() {
        return fString;
    }

    /**
     * フィールド [pos] の値を設定します。
     *
     * フィールドの説明: [予約語、コメント、値などのトークンの位置をあらわすフィールド。ソース文字列の先頭からの位置をあらわします。値は ゼロ(ZERO)オリジンです。デフォルト値は (-1)で、(-1) の場合には「位置情報に意味がない」ことをあらわします。]。
     *
     * @param argPos フィールド[pos]に設定する値。
     */
    public void setPos(final int argPos) {
        fPos = argPos;
    }

    /**
     * フィールド [pos] の値を取得します。
     *
     * フィールドの説明: [予約語、コメント、値などのトークンの位置をあらわすフィールド。ソース文字列の先頭からの位置をあらわします。値は ゼロ(ZERO)オリジンです。デフォルト値は (-1)で、(-1) の場合には「位置情報に意味がない」ことをあらわします。]。
     * デフォルト: [-1]。
     *
     * @return フィールド[pos]から取得した値。
     */
    public int getPos() {
        return fPos;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.commons.sql.format.valueobject.AbstractBlancoSqlToken[");
        buf.append("type=" + fType);
        buf.append(",string=" + fString);
        buf.append(",pos=" + fPos);
        buf.append("]");
        return buf.toString();
    }

    /**
     * このバリューオブジェクトを指定のターゲットに複写します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ複写処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @param target target value object.
     */
    public void copyTo(final AbstractBlancoSqlToken target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: AbstractBlancoSqlToken#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fType
        // Type: int
        target.fType = this.fType;
        // Name: fString
        // Type: java.lang.String
        target.fString = this.fString;
        // Name: fPos
        // Type: int
        target.fPos = this.fPos;
    }
}

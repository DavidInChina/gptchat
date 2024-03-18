package fg;

/* renamed from: fg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3035c implements lg.q {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f30529Y;

    EnumC3035c(int i10) {
        this.f30529Y = i10;
    }

    public static EnumC3035c b(int i10) {
        switch (i10) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // lg.q
    public final int a() {
        return this.f30529Y;
    }
}

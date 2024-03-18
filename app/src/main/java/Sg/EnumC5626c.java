package sg;

import Jf.n;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kg.C4291c;

/* renamed from: sg.c */
/* loaded from: classes2.dex */
public enum EnumC5626c {
    BOOLEAN(n.f9125k0, "boolean", "Z", "java.lang.Boolean"),
    CHAR(n.f9126l0, "char", TokenNames.f24310C, "java.lang.Character"),
    BYTE(n.f9127m0, "byte", "B", "java.lang.Byte"),
    SHORT(n.f9128n0, "short", TokenNames.S, "java.lang.Short"),
    INT(n.f9129o0, "int", TokenNames.f24313I, "java.lang.Integer"),
    FLOAT(n.f9130p0, "float", TokenNames.f24312F, "java.lang.Float"),
    LONG(n.f9131q0, "long", "J", "java.lang.Long"),
    DOUBLE(n.f9132r0, "double", "D", "java.lang.Double");
    

    /* renamed from: r0 */
    public static final HashSet f45586r0 = new HashSet();

    /* renamed from: s0 */
    public static final HashMap f45587s0 = new HashMap();

    /* renamed from: t0 */
    public static final EnumMap f45588t0 = new EnumMap(n.class);

    /* renamed from: u0 */
    public static final HashMap f45589u0 = new HashMap();

    /* renamed from: Y */
    public final n f45591Y;

    /* renamed from: Z */
    public final String f45592Z;

    /* renamed from: h0 */
    public final String f45593h0;

    /* renamed from: i0 */
    public final C4291c f45594i0;

    static {
        EnumC5626c[] values;
        for (EnumC5626c enumC5626c : values()) {
            f45586r0.add(enumC5626c.e());
            HashMap hashMap = f45587s0;
            String str = enumC5626c.f45592Z;
            if (str != null) {
                hashMap.put(str, enumC5626c);
                f45588t0.put((EnumMap) enumC5626c.d(), (n) enumC5626c);
                f45589u0.put(enumC5626c.c(), enumC5626c);
            } else {
                a(11);
                throw null;
            }
        }
    }

    EnumC5626c(n nVar, String str, String str2, String str3) {
        if (nVar != null) {
            this.f45591Y = nVar;
            this.f45592Z = str;
            this.f45593h0 = str2;
            this.f45594i0 = new C4291c(str3);
            return;
        }
        a(6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 2 && i10 != 4) {
                switch (i10) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 7:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 3:
                        objArr[0] = "type";
                        break;
                    case 5:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case 6:
                        objArr[0] = "primitiveType";
                        break;
                    case 9:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i10 == 2 && i10 != 4) {
                    switch (i10) {
                        case 10:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i10) {
                    case 1:
                    case 3:
                        objArr[2] = "get";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case 5:
                        objArr[2] = "getByDesc";
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 2 && i10 != 4) {
                    switch (i10) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 2) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 2) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 == 2) {
        }
        objArr[1] = "get";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 2) {
        }
        throw new IllegalStateException(format222);
    }

    public static EnumC5626c b(String str) {
        EnumC5626c enumC5626c = (EnumC5626c) f45587s0.get(str);
        if (enumC5626c != null) {
            return enumC5626c;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.f45593h0;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public final n d() {
        n nVar = this.f45591Y;
        if (nVar != null) {
            return nVar;
        }
        a(10);
        throw null;
    }

    public final C4291c e() {
        C4291c c4291c = this.f45594i0;
        if (c4291c != null) {
            return c4291c;
        }
        a(13);
        throw null;
    }
}

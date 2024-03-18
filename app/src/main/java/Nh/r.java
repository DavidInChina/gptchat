package Nh;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final r f13211e = new r("VZCBSIFJD", 0, 0, 1);

    /* renamed from: f  reason: collision with root package name */
    public static final r f13212f = new r("VZCBSIFJD", 1, 1, 2);

    /* renamed from: g  reason: collision with root package name */
    public static final r f13213g = new r("VZCBSIFJD", 2, 2, 3);

    /* renamed from: h  reason: collision with root package name */
    public static final r f13214h = new r("VZCBSIFJD", 3, 3, 4);

    /* renamed from: i  reason: collision with root package name */
    public static final r f13215i = new r("VZCBSIFJD", 4, 4, 5);

    /* renamed from: j  reason: collision with root package name */
    public static final r f13216j = new r("VZCBSIFJD", 5, 5, 6);

    /* renamed from: k  reason: collision with root package name */
    public static final r f13217k = new r("VZCBSIFJD", 6, 6, 7);

    /* renamed from: l  reason: collision with root package name */
    public static final r f13218l = new r("VZCBSIFJD", 7, 7, 8);

    /* renamed from: m  reason: collision with root package name */
    public static final r f13219m = new r("VZCBSIFJD", 8, 8, 9);

    /* renamed from: a  reason: collision with root package name */
    public final int f13220a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13221b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13222c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13223d;

    public r(String str, int i10, int i11, int i12) {
        this.f13220a = i10;
        this.f13221b = str;
        this.f13222c = i11;
        this.f13223d = i12;
    }

    public static void a(Class cls, StringBuilder sb2) {
        char c10;
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c10 = 'I';
            } else if (cls == Void.TYPE) {
                c10 = 'V';
            } else if (cls == Boolean.TYPE) {
                c10 = 'Z';
            } else if (cls == Byte.TYPE) {
                c10 = 'B';
            } else if (cls == Character.TYPE) {
                c10 = 'C';
            } else if (cls == Short.TYPE) {
                c10 = 'S';
            } else if (cls == Double.TYPE) {
                c10 = 'D';
            } else if (cls == Float.TYPE) {
                c10 = 'F';
            } else if (cls == Long.TYPE) {
                c10 = 'J';
            } else {
                throw new AssertionError();
            }
            sb2.append(c10);
            return;
        }
        sb2.append('L');
        sb2.append(k(cls));
        sb2.append(';');
    }

    public static int c(String str) {
        int i10 = 0;
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            while (str.charAt(i11) == '[') {
                i11++;
            }
            int i12 = i11 + 1;
            if (str.charAt(i11) == 'L') {
                i11 = Math.max(i12, str.indexOf(59, i12) + 1);
            } else {
                i11 = i12;
            }
            i10++;
        }
        return i10;
    }

    public static r[] d(String str) {
        r[] rVarArr = new r[c(str)];
        int i10 = 0;
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            int i12 = i11;
            while (str.charAt(i12) == '[') {
                i12++;
            }
            int i13 = i12 + 1;
            if (str.charAt(i12) == 'L') {
                i13 = Math.max(i13, str.indexOf(59, i13) + 1);
            }
            rVarArr[i10] = v(i11, i13, str);
            i10++;
            i11 = i13;
        }
        return rVarArr;
    }

    public static int e(String str) {
        int i10 = 1;
        char charAt = str.charAt(1);
        int i11 = 1;
        int i12 = 1;
        while (charAt != ')') {
            if (charAt != 'J' && charAt != 'D') {
                while (str.charAt(i11) == '[') {
                    i11++;
                }
                int i13 = i11 + 1;
                if (str.charAt(i11) == 'L') {
                    i13 = Math.max(i13, str.indexOf(59, i13) + 1);
                }
                i12++;
                i11 = i13;
            } else {
                i11++;
                i12 += 2;
            }
            charAt = str.charAt(i11);
        }
        char charAt2 = str.charAt(i11 + 1);
        if (charAt2 == 'V') {
            return i12 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i10 = 2;
        }
        return (i12 << 2) | i10;
    }

    public static String g(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : constructor.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(")V");
        return sb2.toString();
    }

    public static String k(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static String l(r rVar, r... rVarArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (r rVar2 : rVarArr) {
            rVar2.b(sb2);
        }
        sb2.append(')');
        rVar.b(sb2);
        return sb2.toString();
    }

    public static String m(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(')');
        a(method.getReturnType(), sb2);
        return sb2.toString();
    }

    public static r n(String str) {
        return new r(str, 11, 0, str.length());
    }

    public static r o(String str) {
        int i10;
        if (str.charAt(0) == '[') {
            i10 = 9;
        } else {
            i10 = 12;
        }
        return new r(str, i10, 0, str.length());
    }

    public static int q(String str) {
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            while (str.charAt(i10) == '[') {
                i10++;
            }
            int i11 = i10 + 1;
            if (str.charAt(i10) == 'L') {
                i10 = Math.max(i11, str.indexOf(59, i11) + 1);
            } else {
                i10 = i11;
            }
        }
        return i10 + 1;
    }

    public static r t(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f13216j;
            }
            if (cls == Void.TYPE) {
                return f13211e;
            }
            if (cls == Boolean.TYPE) {
                return f13212f;
            }
            if (cls == Byte.TYPE) {
                return f13214h;
            }
            if (cls == Character.TYPE) {
                return f13213g;
            }
            if (cls == Short.TYPE) {
                return f13215i;
            }
            if (cls == Double.TYPE) {
                return f13219m;
            }
            if (cls == Float.TYPE) {
                return f13217k;
            }
            if (cls == Long.TYPE) {
                return f13218l;
            }
            throw new AssertionError();
        }
        StringBuilder sb2 = new StringBuilder();
        a(cls, sb2);
        return u(sb2.toString());
    }

    public static r u(String str) {
        return v(0, str.length(), str);
    }

    public static r v(int i10, int i11, String str) {
        char charAt = str.charAt(i10);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return f13214h;
                                                case 'C':
                                                    return f13213g;
                                                case 'D':
                                                    return f13219m;
                                                default:
                                                    throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
                                            }
                                        }
                                        return new r(str, 9, i10, i11);
                                    }
                                    return f13212f;
                                }
                                return f13218l;
                            }
                            return f13216j;
                        }
                        return f13211e;
                    }
                    return f13215i;
                }
                return new r(str, 10, i10 + 1, i11 - 1);
            }
            return f13217k;
        }
        return new r(str, 11, i10, i11);
    }

    public final void b(StringBuilder sb2) {
        int i10 = this.f13223d;
        int i11 = this.f13222c;
        String str = this.f13221b;
        int i12 = this.f13220a;
        if (i12 == 10) {
            sb2.append((CharSequence) str, i11 - 1, i10 + 1);
        } else if (i12 == 12) {
            sb2.append('L');
            sb2.append((CharSequence) str, i11, i10);
            sb2.append(';');
        } else {
            sb2.append((CharSequence) str, i11, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        int i10 = 10;
        int i11 = this.f13220a;
        if (i11 == 12) {
            i11 = 10;
        }
        int i12 = rVar.f13220a;
        if (i12 != 12) {
            i10 = i12;
        }
        if (i11 != i10) {
            return false;
        }
        int i13 = this.f13223d;
        int i14 = this.f13222c;
        int i15 = i13 - i14;
        int i16 = rVar.f13223d;
        int i17 = rVar.f13222c;
        if (i15 != i16 - i17) {
            return false;
        }
        while (i14 < i13) {
            if (this.f13221b.charAt(i14) != rVar.f13221b.charAt(i17)) {
                return false;
            }
            i14++;
            i17++;
        }
        return true;
    }

    public final String f() {
        int i10 = this.f13220a;
        String str = this.f13221b;
        int i11 = this.f13223d;
        int i12 = this.f13222c;
        switch (i10) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb2 = new StringBuilder(v(i12 + i(), i11, str).f());
                for (int i13 = i(); i13 > 0; i13--) {
                    sb2.append("[]");
                }
                return sb2.toString();
            case 10:
            case 12:
                return str.substring(i12, i11).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public final String h() {
        int i10 = this.f13223d;
        int i11 = this.f13222c;
        String str = this.f13221b;
        int i12 = this.f13220a;
        if (i12 == 10) {
            return str.substring(i11 - 1, i10 + 1);
        }
        if (i12 == 12) {
            return TokenNames.f24315L + str.substring(i11, i10) + ';';
        }
        return str.substring(i11, i10);
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f13220a;
        if (i11 == 12) {
            i10 = 10;
        } else {
            i10 = i11;
        }
        int i12 = i10 * 13;
        if (i11 >= 9) {
            for (int i13 = this.f13222c; i13 < this.f13223d; i13++) {
                i12 = (this.f13221b.charAt(i13) + i12) * 17;
            }
        }
        return i12;
    }

    public final int i() {
        int i10 = 1;
        while (this.f13221b.charAt(this.f13222c + i10) == '[') {
            i10++;
        }
        return i10;
    }

    public final String j() {
        return this.f13221b.substring(this.f13222c, this.f13223d);
    }

    public final int p(int i10) {
        int i11 = this.f13220a;
        if (i10 != 46 && i10 != 79) {
            switch (i11) {
                case 0:
                    if (i10 == 172) {
                        return 177;
                    }
                    throw new UnsupportedOperationException();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return i10;
                case 6:
                    return i10 + 2;
                case 7:
                    return i10 + 1;
                case 8:
                    return i10 + 3;
                case 9:
                case 10:
                case 12:
                    if (i10 != 21 && i10 != 54 && i10 != 172) {
                        throw new UnsupportedOperationException();
                    }
                    return i10 + 4;
                case 11:
                    throw new UnsupportedOperationException();
                default:
                    throw new AssertionError();
            }
        }
        switch (i11) {
            case 0:
            case 11:
                throw new UnsupportedOperationException();
            case 1:
            case 3:
                return i10 + 5;
            case 2:
                return i10 + 6;
            case 4:
                return i10 + 7;
            case 5:
                return i10;
            case 6:
                return i10 + 2;
            case 7:
                return i10 + 1;
            case 8:
                return i10 + 3;
            case 9:
            case 10:
            case 12:
                return i10 + 4;
            default:
                throw new AssertionError();
        }
    }

    public final int r() {
        switch (this.f13220a) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public final int s() {
        int i10 = this.f13220a;
        if (i10 == 12) {
            return 10;
        }
        return i10;
    }

    public final String toString() {
        return h();
    }
}

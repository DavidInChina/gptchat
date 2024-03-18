package kg;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: kg.e */
/* loaded from: classes.dex */
public final class C4293e {

    /* renamed from: e */
    public static final C4294f f37500e = C4294f.g("<root>");

    /* renamed from: f */
    public static final Pattern f37501f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final C4292d f37502g = new C4292d(0);

    /* renamed from: a */
    public final String f37503a;

    /* renamed from: b */
    public transient C4291c f37504b;

    /* renamed from: c */
    public transient C4293e f37505c;

    /* renamed from: d */
    public transient C4294f f37506d;

    public C4293e(String str) {
        if (str != null) {
            this.f37503a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final C4293e b(C4294f c4294f) {
        String str;
        if (c4294f != null) {
            String str2 = this.f37503a;
            if (str2.isEmpty()) {
                str = c4294f.b();
            } else {
                str = str2 + Separators.DOT + c4294f.b();
            }
            return new C4293e(str, this, c4294f);
        }
        a(9);
        throw null;
    }

    public final void c() {
        String str = this.f37503a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f37506d = C4294f.d(str.substring(lastIndexOf + 1));
            this.f37505c = new C4293e(str.substring(0, lastIndexOf));
            return;
        }
        this.f37506d = C4294f.d(str);
        this.f37505c = C4291c.f37496c.i();
    }

    public final boolean d() {
        if (this.f37504b == null) {
            String str = this.f37503a;
            if (str != null) {
                if (str.indexOf(60) >= 0) {
                    return false;
                }
            } else {
                a(4);
                throw null;
            }
        }
        return true;
    }

    public final List e() {
        List list;
        String str = this.f37503a;
        if (str.isEmpty()) {
            list = Collections.emptyList();
        } else {
            String[] split = f37501f.split(str);
            AbstractC3557B.c0("<this>", split);
            C4292d c4292d = f37502g;
            AbstractC3557B.c0("transform", c4292d);
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(c4292d.invoke(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4293e) && this.f37503a.equals(((C4293e) obj).f37503a)) {
            return true;
        }
        return false;
    }

    public final C4294f f() {
        C4294f c4294f = this.f37506d;
        if (c4294f != null) {
            if (c4294f != null) {
                return c4294f;
            }
            a(10);
            throw null;
        } else if (!this.f37503a.isEmpty()) {
            c();
            C4294f c4294f2 = this.f37506d;
            if (c4294f2 != null) {
                return c4294f2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final C4291c g() {
        C4291c c4291c = this.f37504b;
        if (c4291c != null) {
            if (c4291c != null) {
                return c4291c;
            }
            a(5);
            throw null;
        }
        C4291c c4291c2 = new C4291c(this);
        this.f37504b = c4291c2;
        return c4291c2;
    }

    public final int hashCode() {
        return this.f37503a.hashCode();
    }

    public final String toString() {
        String str = this.f37503a;
        if (str.isEmpty()) {
            str = f37500e.b();
        }
        if (str != null) {
            return str;
        }
        a(18);
        throw null;
    }

    public C4293e(String str, C4291c c4291c) {
        if (str == null) {
            a(0);
            throw null;
        } else if (c4291c != null) {
            this.f37503a = str;
            this.f37504b = c4291c;
        } else {
            a(1);
            throw null;
        }
    }

    public C4293e(String str, C4293e c4293e, C4294f c4294f) {
        if (str != null) {
            this.f37503a = str;
            this.f37505c = c4293e;
            this.f37506d = c4294f;
            return;
        }
        a(3);
        throw null;
    }
}

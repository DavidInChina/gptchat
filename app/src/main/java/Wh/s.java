package Wh;

import id.AbstractC3557B;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jh.H1;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f21249j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f21250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21251b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21252c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21253d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21254e;

    /* renamed from: f  reason: collision with root package name */
    public final List f21255f;

    /* renamed from: g  reason: collision with root package name */
    public final String f21256g;

    /* renamed from: h  reason: collision with root package name */
    public final String f21257h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21258i;

    public s(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f21250a = str;
        this.f21251b = str2;
        this.f21252c = str3;
        this.f21253d = str4;
        this.f21254e = i10;
        this.f21255f = arrayList2;
        this.f21256g = str5;
        this.f21257h = str6;
        this.f21258i = AbstractC3557B.K(str, "https");
    }

    public final String a() {
        if (this.f21252c.length() == 0) {
            return "";
        }
        String str = this.f21257h;
        String substring = str.substring(Lg.n.k2(str, ':', this.f21250a.length() + 3, false, 4) + 1, Lg.n.k2(str, '@', 0, false, 6));
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final String b() {
        String str = this.f21257h;
        int k22 = Lg.n.k2(str, '/', this.f21250a.length() + 3, false, 4);
        String substring = str.substring(k22, Xh.b.f(str, k22, str.length(), "?#"));
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final ArrayList c() {
        String str = this.f21257h;
        int k22 = Lg.n.k2(str, '/', this.f21250a.length() + 3, false, 4);
        int f6 = Xh.b.f(str, k22, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (k22 < f6) {
            int i10 = k22 + 1;
            int e10 = Xh.b.e('/', i10, f6, str);
            String substring = str.substring(i10, e10);
            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
            arrayList.add(substring);
            k22 = e10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f21255f == null) {
            return null;
        }
        String str = this.f21257h;
        int k22 = Lg.n.k2(str, '?', 0, false, 6) + 1;
        String substring = str.substring(k22, Xh.b.e('#', k22, str.length(), str));
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final String e() {
        if (this.f21251b.length() == 0) {
            return "";
        }
        int length = this.f21250a.length() + 3;
        String str = this.f21257h;
        String substring = str.substring(length, Xh.b.f(str, length, str.length(), ":@"));
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s) && AbstractC3557B.K(((s) obj).f21257h, this.f21257h)) {
            return true;
        }
        return false;
    }

    public final r f() {
        ArrayList arrayList;
        r rVar = new r();
        String str = this.f21250a;
        rVar.f21241a = str;
        rVar.f21242b = e();
        rVar.f21243c = a();
        rVar.f21244d = this.f21253d;
        int l10 = H1.l(str);
        int i10 = this.f21254e;
        if (i10 == l10) {
            i10 = -1;
        }
        rVar.f21245e = i10;
        ArrayList arrayList2 = rVar.f21246f;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d10 = d();
        String str2 = null;
        if (d10 != null) {
            arrayList = H1.u(H1.h(d10, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            arrayList = null;
        }
        rVar.f21247g = arrayList;
        if (this.f21256g != null) {
            String str3 = this.f21257h;
            str2 = str3.substring(Lg.n.k2(str3, '#', 0, false, 6) + 1);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", str2);
        }
        rVar.f21248h = str2;
        return rVar;
    }

    public final String g() {
        r rVar;
        try {
            rVar = new r();
            rVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        AbstractC3557B.Z(rVar);
        rVar.f21242b = H1.h("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        rVar.f21243c = H1.h("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return rVar.b().f21257h;
    }

    public final URI h() {
        String str;
        String str2;
        r f6 = f();
        String str3 = f6.f21244d;
        String str4 = null;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC3557B.b0("compile(...)", compile);
            str = compile.matcher(str3).replaceAll("");
            AbstractC3557B.b0("replaceAll(...)", str);
        } else {
            str = null;
        }
        f6.f21244d = str;
        ArrayList arrayList = f6.f21246f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, H1.h((String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f6.f21247g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str5 = (String) arrayList2.get(i11);
                if (str5 != null) {
                    str2 = H1.h(str5, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i11, str2);
            }
        }
        String str6 = f6.f21248h;
        if (str6 != null) {
            str4 = H1.h(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f6.f21248h = str4;
        String rVar = f6.toString();
        try {
            return new URI(rVar);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC3557B.b0("compile(...)", compile2);
                String replaceAll = compile2.matcher(rVar).replaceAll("");
                AbstractC3557B.b0("replaceAll(...)", replaceAll);
                URI create = URI.create(replaceAll);
                AbstractC3557B.b0("{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }", create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f21257h.hashCode();
    }

    public final String toString() {
        return this.f21257h;
    }
}

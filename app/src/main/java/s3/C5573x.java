package s3;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import io.sentry.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.AbstractC3957g;
import jf.C3963m;
import jf.EnumC3958h;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* renamed from: s3.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5573x {

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f45374q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f45375r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a  reason: collision with root package name */
    public final String f45376a;

    /* renamed from: b  reason: collision with root package name */
    public final String f45377b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45378c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f45379d;

    /* renamed from: e  reason: collision with root package name */
    public final String f45380e;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC3957g f45383h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f45384i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC3957g f45385j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC3957g f45386k;

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC3957g f45387l;

    /* renamed from: n  reason: collision with root package name */
    public final String f45389n;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f45391p;

    /* renamed from: f  reason: collision with root package name */
    public final C3963m f45381f = R4.b.D1(new C5571v(this, 6));

    /* renamed from: g  reason: collision with root package name */
    public final C3963m f45382g = R4.b.D1(new C5571v(this, 4));

    /* renamed from: m  reason: collision with root package name */
    public final C3963m f45388m = R4.b.D1(new C5571v(this, 2));

    /* renamed from: o  reason: collision with root package name */
    public final C3963m f45390o = R4.b.D1(new C5571v(this, 5));

    public C5573x(String str, String str2, String str3) {
        List list;
        List list2;
        boolean z10;
        this.f45376a = str;
        this.f45377b = str2;
        this.f45378c = str3;
        ArrayList arrayList = new ArrayList();
        this.f45379d = arrayList;
        EnumC3958h enumC3958h = EnumC3958h.f36153Z;
        this.f45383h = R4.b.C1(enumC3958h, new C5571v(this, 7));
        this.f45385j = R4.b.C1(enumC3958h, new C5571v(this, 1));
        this.f45386k = R4.b.C1(enumC3958h, new C5571v(this, 0));
        this.f45387l = R4.b.C1(enumC3958h, new C5571v(this, 3));
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f45374q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
            a(substring, arrayList, sb2);
            if (!Lg.n.Z1(sb2, r1.DEFAULT_PROPAGATION_TARGETS, false) && !Lg.n.Z1(sb2, "([^/]+?)", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45391p = z10;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb3 = sb2.toString();
            AbstractC3557B.b0("uriRegex.toString()", sb3);
            this.f45380e = Lg.n.A2(sb3, r1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
        }
        if (str3 != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                Pattern compile = Pattern.compile(Separators.SLASH);
                AbstractC3557B.b0("compile(...)", compile);
                Lg.n.D2(0);
                Matcher matcher2 = compile.matcher(str3);
                if (!matcher2.find()) {
                    list = AbstractC4344b.F0(str3.toString());
                } else {
                    ArrayList arrayList2 = new ArrayList(10);
                    int i10 = 0;
                    do {
                        arrayList2.add(str3.subSequence(i10, matcher2.start()).toString());
                        i10 = matcher2.end();
                    } while (matcher2.find());
                    arrayList2.add(str3.subSequence(i10, str3.length()).toString());
                    list = arrayList2;
                }
                if (!list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list2 = kf.t.G2(list, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list2 = kf.v.f37483Y;
                this.f45389n = Lg.n.A2("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.A("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
    }

    public static void a(String str, List list, StringBuilder sb2) {
        Matcher matcher = f45375r.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", group);
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]+?)");
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
            sb2.append(Pattern.quote(substring2));
        }
    }

    public static void d(Bundle bundle, String str, String str2, C5557g c5557g) {
        if (c5557g != null) {
            T t10 = c5557g.f45297a;
            t10.getClass();
            AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
            t10.e(bundle, str, t10.c(str2));
            return;
        }
        bundle.putString(str, str2);
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f45379d;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String str = (String) next;
                String decode = Uri.decode(matcher.group(i11));
                C5557g c5557g = (C5557g) linkedHashMap.get(str);
                try {
                    AbstractC3557B.b0("value", decode);
                    d(bundle, str, decode, c5557g);
                    arrayList2.add(jf.y.f36177a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return true;
    }

    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Matcher matcher;
        String query;
        C5573x c5573x = this;
        for (Map.Entry entry : ((Map) c5573x.f45383h.getValue()).entrySet()) {
            C5570u c5570u = (C5570u) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (c5573x.f45384i && (query = uri.getQuery()) != null && !AbstractC3557B.K(query, uri.toString())) {
                queryParameters = AbstractC4344b.F0(query);
            }
            if (queryParameters != null) {
                for (String str : queryParameters) {
                    String str2 = c5570u.f45368a;
                    if (str2 != null) {
                        matcher = Pattern.compile(str2, 32).matcher(str);
                    } else {
                        matcher = null;
                    }
                    int i10 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = c5570u.f45369b;
                        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 >= 0) {
                                String str3 = (String) next;
                                String group = matcher.group(i11);
                                if (group == null) {
                                    group = "";
                                }
                                try {
                                    C5557g c5557g = (C5557g) linkedHashMap.get(str3);
                                    if (!bundle.containsKey(str3)) {
                                        if (!AbstractC3557B.K(group, '{' + str3 + '}')) {
                                            d(bundle2, str3, group, c5557g);
                                        }
                                    } else if (c5557g != null) {
                                        T t10 = c5557g.f45297a;
                                        Object a5 = t10.a(bundle, str3);
                                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str3);
                                        if (bundle.containsKey(str3)) {
                                            t10.e(bundle, str3, t10.d(group, a5));
                                        } else {
                                            throw new IllegalArgumentException("There is no previous value in this bundle.");
                                        }
                                    } else {
                                        continue;
                                    }
                                    arrayList2.add(jf.y.f36177a);
                                    i10 = i11;
                                } catch (IllegalArgumentException unused) {
                                    continue;
                                }
                            } else {
                                AbstractC4344b.d1();
                                throw null;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                continue;
            }
            c5573x = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5573x)) {
            return false;
        }
        C5573x c5573x = (C5573x) obj;
        if (!AbstractC3557B.K(this.f45376a, c5573x.f45376a) || !AbstractC3557B.K(this.f45377b, c5573x.f45377b) || !AbstractC3557B.K(this.f45378c, c5573x.f45378c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45376a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        String str2 = this.f45377b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f45378c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }
}

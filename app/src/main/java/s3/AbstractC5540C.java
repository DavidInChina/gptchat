package s3;

import G0.C0571a;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.C4288m;
import l8.AbstractC4344b;
import q1.AbstractC5260f;
import w.C6050B;
import w.C6052D;
import w.C6053E;
import yf.AbstractC6583a;

/* renamed from: s3.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5540C {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f45214n0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f45215Y;

    /* renamed from: Z  reason: collision with root package name */
    public C5542E f45216Z;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f45217h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f45218i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final C6050B f45219j0 = new C6050B(0);

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashMap f45220k0 = new LinkedHashMap();

    /* renamed from: l0  reason: collision with root package name */
    public int f45221l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f45222m0;

    static {
        new LinkedHashMap();
    }

    public AbstractC5540C(W w10) {
        AbstractC3557B.c0("navigator", w10);
        LinkedHashMap linkedHashMap = X.f45278b;
        this.f45215Y = B2.u.y(w10.getClass());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if ((!q1.AbstractC5260f.F(r2, new s3.C5572w(0, r13)).isEmpty()) != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5539B I(U3.u uVar) {
        Bundle bundle;
        int i10;
        String str;
        boolean z10;
        String str2;
        Iterator it;
        int i11;
        C5539B c5539b;
        Matcher matcher;
        int i12;
        List list;
        int i13;
        List list2;
        List list3;
        int i14;
        Matcher matcher2;
        Matcher matcher3;
        AbstractC5540C abstractC5540C = this;
        U3.u uVar2 = uVar;
        ArrayList arrayList = abstractC5540C.f45218i0;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        C5539B c5539b2 = null;
        while (it2.hasNext()) {
            C5573x c5573x = (C5573x) it2.next();
            Uri uri = (Uri) uVar2.f17492Z;
            LinkedHashMap linkedHashMap = abstractC5540C.f45220k0;
            if (uri != null) {
                c5573x.getClass();
                AbstractC3557B.c0("arguments", linkedHashMap);
                Pattern pattern = (Pattern) c5573x.f45381f.getValue();
                if (pattern != null) {
                    matcher2 = pattern.matcher(uri.toString());
                } else {
                    matcher2 = bundle2;
                }
                if (matcher2 != 0 && matcher2.matches()) {
                    bundle = new Bundle();
                    if (c5573x.b(matcher2, bundle, linkedHashMap) && (!((Boolean) c5573x.f45382g.getValue()).booleanValue() || c5573x.c(uri, bundle, linkedHashMap))) {
                        String fragment = uri.getFragment();
                        Pattern pattern2 = (Pattern) c5573x.f45388m.getValue();
                        if (pattern2 != null) {
                            matcher3 = pattern2.matcher(String.valueOf(fragment));
                        } else {
                            matcher3 = bundle2;
                        }
                        if (matcher3 != 0 && matcher3.matches()) {
                            List list4 = (List) c5573x.f45386k.getValue();
                            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list4, 10));
                            Iterator it3 = list4.iterator();
                            int i15 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i16 = i15 + 1;
                                if (i15 >= 0) {
                                    String str3 = (String) next;
                                    String decode = Uri.decode(matcher3.group(i16));
                                    C5557g c5557g = (C5557g) linkedHashMap.get(str3);
                                    Iterator it4 = it3;
                                    try {
                                        AbstractC3557B.b0("value", decode);
                                        C5573x.d(bundle, str3, decode, c5557g);
                                        arrayList2.add(jf.y.f36177a);
                                        i15 = i16;
                                        it3 = it4;
                                        bundle2 = null;
                                    } catch (IllegalArgumentException unused) {
                                        bundle2 = null;
                                    }
                                } else {
                                    AbstractC4344b.d1();
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
            bundle = bundle2;
            if (uri != null) {
                String str4 = c5573x.f45376a;
                if (str4 != null) {
                    List<String> pathSegments = uri.getPathSegments();
                    List<String> pathSegments2 = Uri.parse(str4).getPathSegments();
                    AbstractC3557B.b0("requestedPathSegments", pathSegments);
                    AbstractC3557B.b0("uriPathSegments", pathSegments2);
                    Set O22 = kf.t.O2(pathSegments);
                    O22.retainAll(kf.s.P1(pathSegments2));
                    i10 = O22.size();
                    str = (String) uVar2.f17493h0;
                    if (str == null && AbstractC3557B.K(str, c5573x.f45377b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str2 = (String) uVar2.f17494i0;
                    if (str2 == null) {
                        String str5 = c5573x.f45378c;
                        if (str5 != null) {
                            Pattern pattern3 = (Pattern) c5573x.f45390o.getValue();
                            AbstractC3557B.Z(pattern3);
                            if (pattern3.matcher(str2).matches()) {
                                Pattern compile = Pattern.compile(Separators.SLASH);
                                AbstractC3557B.b0("compile(...)", compile);
                                Lg.n.D2(0);
                                Matcher matcher4 = compile.matcher(str5);
                                if (!matcher4.find()) {
                                    list = AbstractC4344b.F0(str5.toString());
                                    it = it2;
                                } else {
                                    ArrayList arrayList3 = new ArrayList(10);
                                    it = it2;
                                    int i17 = 0;
                                    while (true) {
                                        arrayList3.add(str5.subSequence(i17, matcher4.start()).toString());
                                        i17 = matcher4.end();
                                        if (!matcher4.find()) {
                                            break;
                                        }
                                    }
                                    arrayList3.add(str5.subSequence(i17, str5.length()).toString());
                                    list = arrayList3;
                                }
                                boolean isEmpty = list.isEmpty();
                                List list5 = kf.v.f37483Y;
                                if (!isEmpty) {
                                    ListIterator listIterator = list.listIterator(list.size());
                                    while (listIterator.hasPrevious()) {
                                        if (((String) listIterator.previous()).length() != 0) {
                                            i13 = 1;
                                            list2 = kf.t.G2(list, listIterator.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                i13 = 1;
                                list2 = list5;
                                String str6 = (String) list2.get(0);
                                String str7 = (String) list2.get(i13);
                                Pattern compile2 = Pattern.compile(Separators.SLASH);
                                AbstractC3557B.b0("compile(...)", compile2);
                                Lg.n.D2(0);
                                Matcher matcher5 = compile2.matcher(str2);
                                if (!matcher5.find()) {
                                    list3 = AbstractC4344b.F0(str2.toString());
                                } else {
                                    ArrayList arrayList4 = new ArrayList(10);
                                    int i18 = 0;
                                    do {
                                        arrayList4.add(str2.subSequence(i18, matcher5.start()).toString());
                                        i18 = matcher5.end();
                                    } while (matcher5.find());
                                    arrayList4.add(str2.subSequence(i18, str2.length()).toString());
                                    list3 = arrayList4;
                                }
                                if (!list3.isEmpty()) {
                                    ListIterator listIterator2 = list3.listIterator(list3.size());
                                    while (listIterator2.hasPrevious()) {
                                        if (((String) listIterator2.previous()).length() != 0) {
                                            i14 = 1;
                                            list5 = kf.t.G2(list3, listIterator2.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                }
                                i14 = 1;
                                String str8 = (String) list5.get(i14);
                                if (AbstractC3557B.K(str6, (String) list5.get(0))) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                if (AbstractC3557B.K(str7, str8)) {
                                    i12++;
                                }
                                i11 = i12;
                            }
                        }
                        it = it2;
                        i12 = -1;
                        i11 = i12;
                    } else {
                        it = it2;
                        i11 = -1;
                    }
                    if (bundle == null) {
                        if (z10 || i11 > -1) {
                            AbstractC3557B.c0("arguments", linkedHashMap);
                            Bundle bundle3 = new Bundle();
                            if (uri != null) {
                                Pattern pattern4 = (Pattern) c5573x.f45381f.getValue();
                                if (pattern4 != null) {
                                    matcher = pattern4.matcher(uri.toString());
                                } else {
                                    matcher = null;
                                }
                                if (matcher != null && matcher.matches()) {
                                    c5573x.b(matcher, bundle3, linkedHashMap);
                                    if (((Boolean) c5573x.f45382g.getValue()).booleanValue()) {
                                        c5573x.c(uri, bundle3, linkedHashMap);
                                    }
                                }
                            }
                            if (!AbstractC5260f.F(linkedHashMap, new C5572w(1, bundle3)).isEmpty()) {
                            }
                        }
                        bundle2 = null;
                        abstractC5540C = this;
                        uVar2 = uVar;
                        it2 = it;
                    }
                    c5539b = new C5539B(this, bundle, c5573x.f45391p, i10, z10, i11);
                    if (c5539b2 == null && c5539b.compareTo(c5539b2) <= 0) {
                        bundle2 = null;
                        abstractC5540C = this;
                        uVar2 = uVar;
                        it2 = it;
                    } else {
                        bundle2 = null;
                        abstractC5540C = this;
                        c5539b2 = c5539b;
                        it2 = it;
                        uVar2 = uVar;
                    }
                }
            } else {
                c5573x.getClass();
            }
            i10 = 0;
            str = (String) uVar2.f17493h0;
            if (str == null) {
            }
            z10 = false;
            str2 = (String) uVar2.f17494i0;
            if (str2 == null) {
            }
            if (bundle == null) {
            }
            c5539b = new C5539B(this, bundle, c5573x.f45391p, i10, z10, i11);
            if (c5539b2 == null) {
            }
            bundle2 = null;
            abstractC5540C = this;
            c5539b2 = c5539b;
            it2 = it;
            uVar2 = uVar;
        }
        return c5539b2;
    }

    public final C5539B M(String str) {
        AbstractC3557B.c0("route", str);
        Uri parse = Uri.parse(B2.u.u(str));
        AbstractC3557B.Y("Uri.parse(this)", parse);
        U3.u uVar = new U3.u(parse, null, null, 16);
        if (this instanceof C5542E) {
            return ((C5542E) this).i0(uVar);
        }
        return I(uVar);
    }

    public final void T(String str) {
        Object obj = null;
        if (str == null) {
            this.f45221l0 = 0;
        } else if (!Lg.n.n2(str)) {
            String u10 = B2.u.u(str);
            this.f45221l0 = u10.hashCode();
            r(new C5573x(u10, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f45218i0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC3557B.K(((C5573x) next).f45376a, B2.u.u(this.f45222m0))) {
                obj = next;
                break;
            }
        }
        Ad.l.H(arrayList).remove(obj);
        this.f45222m0 = str;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC5540C)) {
            return false;
        }
        AbstractC5540C abstractC5540C = (AbstractC5540C) obj;
        boolean K10 = AbstractC3557B.K(this.f45218i0, abstractC5540C.f45218i0);
        C6050B c6050b = this.f45219j0;
        int f6 = c6050b.f();
        C6050B c6050b2 = abstractC5540C.f45219j0;
        if (f6 == c6050b2.f()) {
            for (Number number : Kg.p.Z0(new C6052D(c6050b))) {
                int intValue = number.intValue();
                if (!AbstractC3557B.K(c6050b.c(intValue), c6050b2.c(intValue))) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        } else {
            z10 = false;
            break;
        }
        LinkedHashMap linkedHashMap = this.f45220k0;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = abstractC5540C.f45220k0;
        if (size == linkedHashMap2.size()) {
            Iterator it = kf.t.V1(linkedHashMap.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (linkedHashMap2.containsKey(entry.getKey())) {
                    if (!AbstractC3557B.K(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                    }
                }
            }
            z11 = true;
            if (this.f45221l0 != abstractC5540C.f45221l0 && AbstractC3557B.K(this.f45222m0, abstractC5540C.f45222m0) && K10 && z10 && z11) {
                return true;
            }
            return false;
        }
        z11 = false;
        if (this.f45221l0 != abstractC5540C.f45221l0) {
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f45221l0 * 31;
        String str = this.f45222m0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i15 + i10;
        Iterator it = this.f45218i0.iterator();
        while (it.hasNext()) {
            C5573x c5573x = (C5573x) it.next();
            int i17 = i16 * 31;
            String str2 = c5573x.f45376a;
            if (str2 != null) {
                i12 = str2.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 31;
            String str3 = c5573x.f45377b;
            if (str3 != null) {
                i13 = str3.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 31;
            String str4 = c5573x.f45378c;
            if (str4 != null) {
                i14 = str4.hashCode();
            } else {
                i14 = 0;
            }
            i16 = i19 + i14;
        }
        C6050B c6050b = this.f45219j0;
        AbstractC3557B.c0("<this>", c6050b);
        C6053E c6053e = new C6053E(0, c6050b);
        if (!c6053e.hasNext()) {
            LinkedHashMap linkedHashMap = this.f45220k0;
            for (String str5 : linkedHashMap.keySet()) {
                int v10 = E9.f.v(str5, i16 * 31, 31);
                Object obj = linkedHashMap.get(str5);
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                i16 = v10 + i11;
            }
            return i16;
        }
        AbstractC2469q0.p(c6053e.next());
        throw null;
    }

    public final void r(C5573x c5573x) {
        AbstractC3557B.c0("navDeepLink", c5573x);
        ArrayList F10 = AbstractC5260f.F(this.f45220k0, new C0571a(13, c5573x));
        if (F10.isEmpty()) {
            this.f45218i0.add(c5573x);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + c5573x.f45376a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + F10).toString());
    }

    public final Bundle s(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f45220k0;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C5557g c5557g = (C5557g) entry.getValue();
            c5557g.getClass();
            AbstractC3557B.c0("name", str);
            if (c5557g.f45299c) {
                c5557g.f45297a.e(bundle2, str, c5557g.f45300d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C5557g c5557g2 = (C5557g) entry2.getValue();
                c5557g2.getClass();
                AbstractC3557B.c0("name", str2);
                boolean z10 = c5557g2.f45298b;
                T t10 = c5557g2.f45297a;
                if (z10 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        t10.a(bundle2, str2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder s10 = android.gov.nist.core.a.s("Wrong argument type for '", str2, "' in argument bundle. ");
                s10.append(t10.b());
                s10.append(" expected.");
                throw new IllegalArgumentException(s10.toString().toString());
            }
        }
        return bundle2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(Separators.LPAREN);
        sb2.append("0x");
        sb2.append(Integer.toHexString(this.f45221l0));
        sb2.append(Separators.RPAREN);
        String str = this.f45222m0;
        if (str != null && !Lg.n.n2(str)) {
            sb2.append(" route=");
            sb2.append(this.f45222m0);
        }
        if (this.f45217h0 != null) {
            sb2.append(" label=");
            sb2.append(this.f45217h0);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }

    public final int[] y(AbstractC5540C abstractC5540C) {
        C5542E c5542e;
        C4288m c4288m = new C4288m();
        C5542E c5542e2 = this;
        while (true) {
            C5542E c5542e3 = c5542e2.f45216Z;
            if (abstractC5540C != null) {
                c5542e = abstractC5540C.f45216Z;
            } else {
                c5542e = null;
            }
            if (c5542e != null) {
                C5542E c5542e4 = abstractC5540C.f45216Z;
                AbstractC3557B.Z(c5542e4);
                if (c5542e4.U(c5542e2.f45221l0, true) == c5542e2) {
                    c4288m.addFirst(c5542e2);
                    break;
                }
            }
            if (c5542e3 == null || c5542e3.f45228p0 != c5542e2.f45221l0) {
                c4288m.addFirst(c5542e2);
            }
            if (AbstractC3557B.K(c5542e3, abstractC5540C) || c5542e3 == null) {
                break;
            }
            c5542e2 = c5542e3;
        }
        List<AbstractC5540C> K22 = kf.t.K2(c4288m);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(K22, 10));
        for (AbstractC5540C abstractC5540C2 : K22) {
            arrayList.add(Integer.valueOf(abstractC5540C2.f45221l0));
        }
        return kf.t.J2(arrayList);
    }
}

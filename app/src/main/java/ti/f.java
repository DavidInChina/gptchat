package ti;

import androidx.lifecycle.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import wi.s;
import wi.u;
import wi.w;
import wi.z;

/* loaded from: classes2.dex */
public final class f implements yi.d {

    /* renamed from: r  reason: collision with root package name */
    public static final LinkedHashSet f46255r = new LinkedHashSet(Arrays.asList(wi.b.class, wi.j.class, wi.h.class, wi.k.class, z.class, wi.q.class, wi.n.class));

    /* renamed from: s  reason: collision with root package name */
    public static final Map f46256s;

    /* renamed from: a  reason: collision with root package name */
    public xi.d f46257a;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46261e;

    /* renamed from: i  reason: collision with root package name */
    public boolean f46265i;

    /* renamed from: j  reason: collision with root package name */
    public final List f46266j;

    /* renamed from: k  reason: collision with root package name */
    public final y7.b f46267k;

    /* renamed from: l  reason: collision with root package name */
    public final List f46268l;

    /* renamed from: m  reason: collision with root package name */
    public final xi.a f46269m;

    /* renamed from: n  reason: collision with root package name */
    public final b f46270n;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f46272p;

    /* renamed from: b  reason: collision with root package name */
    public int f46258b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f46259c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f46260d = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f46262f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f46263g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f46264h = 0;

    /* renamed from: o  reason: collision with root package name */
    public final D f46271o = new D(8);

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f46273q = new ArrayList();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(wi.b.class, new h(3));
        hashMap.put(wi.j.class, new h(0));
        hashMap.put(wi.h.class, new h(4));
        hashMap.put(wi.k.class, new h(1));
        hashMap.put(z.class, new h(6));
        hashMap.put(wi.q.class, new h(2));
        hashMap.put(wi.n.class, new h(5));
        f46256s = Collections.unmodifiableMap(hashMap);
    }

    public f(ArrayList arrayList, y7.b bVar, List list, xi.a aVar) {
        ArrayList arrayList2 = new ArrayList();
        this.f46272p = arrayList2;
        this.f46266j = arrayList;
        this.f46267k = bVar;
        this.f46268l = list;
        this.f46269m = aVar;
        b bVar2 = new b(1);
        this.f46270n = bVar2;
        arrayList2.add(new e(bVar2, 0));
    }

    public final void a(e eVar) {
        while (true) {
            yi.a h10 = h();
            yi.a aVar = eVar.f46253a;
            if (!h10.c(aVar.f())) {
                f(1);
            } else {
                h().f().c(aVar.f());
                this.f46272p.add(eVar);
                return;
            }
        }
    }

    public final void b(q qVar) {
        m mVar = qVar.f46316b;
        mVar.a();
        Iterator it = mVar.f46300c.iterator();
        while (it.hasNext()) {
            wi.p pVar = (wi.p) it.next();
            u uVar = qVar.f46315a;
            uVar.getClass();
            pVar.i();
            s sVar = uVar.f48611d;
            pVar.f48611d = sVar;
            if (sVar != null) {
                sVar.f48612e = pVar;
            }
            pVar.f48612e = uVar;
            uVar.f48611d = pVar;
            s sVar2 = uVar.f48608a;
            pVar.f48608a = sVar2;
            if (pVar.f48611d == null) {
                sVar2.f48609b = pVar;
            }
            D d10 = this.f46271o;
            d10.getClass();
            String a5 = vi.a.a(pVar.f48605g);
            if (!d10.f25290b.containsKey(a5)) {
                d10.f25290b.put(a5, pVar);
            }
        }
    }

    public final void c() {
        CharSequence charSequence;
        w wVar;
        if (this.f46261e) {
            CharSequence charSequence2 = this.f46257a.f50076a;
            CharSequence subSequence = charSequence2.subSequence(this.f46259c + 1, charSequence2.length());
            int i10 = 4 - (this.f46260d % 4);
            StringBuilder sb2 = new StringBuilder(subSequence.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence);
            charSequence = sb2.toString();
        } else {
            int i12 = this.f46259c;
            if (i12 == 0) {
                charSequence = this.f46257a.f50076a;
            } else {
                CharSequence charSequence3 = this.f46257a.f50076a;
                charSequence = charSequence3.subSequence(i12, charSequence3.length());
            }
        }
        if (this.f46269m == xi.a.f50069Z) {
            wVar = new w(this.f46258b, this.f46259c, charSequence.length());
        } else {
            wVar = null;
        }
        h().a(new xi.d(charSequence, wVar));
        d();
    }

    public final void d() {
        if (this.f46269m != xi.a.f50068Y) {
            int i10 = 1;
            while (true) {
                ArrayList arrayList = this.f46272p;
                if (i10 < arrayList.size()) {
                    e eVar = (e) arrayList.get(i10);
                    int i11 = eVar.f46254b;
                    int length = this.f46257a.f50076a.length() - i11;
                    if (length != 0) {
                        eVar.f46253a.b(new w(this.f46258b, i11, length));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e() {
        char charAt = this.f46257a.f50076a.charAt(this.f46259c);
        this.f46259c++;
        if (charAt == '\t') {
            int i10 = this.f46260d;
            this.f46260d = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f46260d++;
    }

    public final void f(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList = this.f46272p;
            yi.a aVar = ((e) arrayList.remove(arrayList.size() - 1)).f46253a;
            if (aVar instanceof q) {
                b((q) aVar);
            }
            aVar.e();
            this.f46273q.add(aVar);
        }
    }

    public final void g() {
        int i10 = this.f46259c;
        int i11 = this.f46260d;
        this.f46265i = true;
        int length = this.f46257a.f50076a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f46257a.f50076a.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.f46265i = false;
                    break;
                } else {
                    i10++;
                    i11++;
                }
            } else {
                i10++;
                i11 += 4 - (i11 % 4);
            }
        }
        this.f46262f = i10;
        this.f46263g = i11;
        this.f46264h = i11 - this.f46260d;
    }

    public final yi.a h() {
        ArrayList arrayList = this.f46272p;
        return ((e) arrayList.get(arrayList.size() - 1)).f46253a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
        k(r13.f46262f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        w wVar;
        ArrayList arrayList;
        boolean z10;
        c cVar;
        List list;
        yi.a[] aVarArr;
        this.f46258b++;
        this.f46259c = 0;
        this.f46260d = 0;
        this.f46261e = false;
        int length = str.length();
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str, 0, i10);
                }
                sb2.append('\ufffd');
            } else if (sb2 != null) {
                sb2.append(charAt);
            }
        }
        if (sb2 != null) {
            str = sb2.toString();
        }
        if (this.f46269m != xi.a.f50068Y) {
            wVar = new w(this.f46258b, 0, str.length());
        } else {
            wVar = null;
        }
        this.f46257a = new xi.d(str, wVar);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            arrayList = this.f46272p;
            if (i11 >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i11);
            yi.a aVar = eVar.f46253a;
            g();
            a i13 = aVar.i(this);
            if (!(i13 instanceof a)) {
                break;
            }
            eVar.f46254b = this.f46259c;
            if (i13.f46239c) {
                d();
                f(arrayList.size() - i11);
                return;
            }
            int i14 = i13.f46237a;
            if (i14 != -1) {
                k(i14);
            } else {
                int i15 = i13.f46238b;
                if (i15 != -1) {
                    j(i15);
                }
            }
            i12++;
            i11++;
        }
        int size = arrayList.size() - i12;
        r2 = ((e) arrayList.get(i12 - 1)).f46253a;
        int i16 = this.f46259c;
        if (!(r2.f() instanceof u) && !r2.g()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = false;
        while (true) {
            if (!z10) {
                break;
            }
            i16 = this.f46259c;
            g();
            if (this.f46265i || (this.f46264h < 4 && Character.isLetter(Character.codePointAt(this.f46257a.f50076a, this.f46262f)))) {
                break;
            }
            S4.o oVar = new S4.o(25, r2);
            Iterator it = this.f46266j.iterator();
            while (true) {
                if (it.hasNext()) {
                    cVar = ((yi.c) it.next()).a(this, oVar);
                    if (cVar instanceof c) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar == null) {
                k(this.f46262f);
                break;
            }
            int i17 = this.f46259c;
            if (size > 0) {
                f(size);
                size = 0;
            }
            int i18 = cVar.f46243b;
            if (i18 != -1) {
                k(i18);
            } else {
                int i19 = cVar.f46244c;
                if (i19 != -1) {
                    j(i19);
                }
            }
            if (cVar.f46245d) {
                yi.a aVar2 = ((e) arrayList.remove(arrayList.size() - 1)).f46253a;
                if (aVar2 instanceof q) {
                    b((q) aVar2);
                }
                aVar2.e();
                aVar2.f().i();
                list = aVar2.f().d();
            } else {
                list = null;
            }
            for (yi.a aVar3 : cVar.f46242a) {
                a(new e(aVar3, i17));
                if (list != null) {
                    aVar3.f().g(list);
                }
                z10 = aVar3.g();
            }
            z11 = true;
        }
        if (!z11 && !this.f46265i && h().d()) {
            ((e) arrayList.get(arrayList.size() - 1)).f46254b = i16;
            c();
            return;
        }
        if (size > 0) {
            f(size);
        }
        if (!aVar3.g()) {
            c();
        } else if (!this.f46265i) {
            a(new e(new q(), i16));
            c();
        } else {
            d();
        }
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f46263g;
        if (i10 >= i12) {
            this.f46259c = this.f46262f;
            this.f46260d = i12;
        }
        int length = this.f46257a.f50076a.length();
        while (true) {
            i11 = this.f46260d;
            if (i11 >= i10 || this.f46259c == length) {
                break;
            }
            e();
        }
        if (i11 > i10) {
            this.f46259c--;
            this.f46260d = i10;
            this.f46261e = true;
            return;
        }
        this.f46261e = false;
    }

    public final void k(int i10) {
        int i11 = this.f46262f;
        if (i10 >= i11) {
            this.f46259c = i11;
            this.f46260d = this.f46263g;
        }
        int length = this.f46257a.f50076a.length();
        while (true) {
            int i12 = this.f46259c;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            e();
        }
        this.f46261e = false;
    }
}

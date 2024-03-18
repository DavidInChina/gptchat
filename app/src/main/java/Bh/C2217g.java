package bh;

import Uf.A;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import dh.AbstractC2704h0;
import dh.AbstractC2710l;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import jf.C3963m;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import kf.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import yf.AbstractC6583a;

/* renamed from: bh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2217g implements SerialDescriptor, AbstractC2710l {

    /* renamed from: a  reason: collision with root package name */
    public final String f25995a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2223m f25996b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25997c;

    /* renamed from: d  reason: collision with root package name */
    public final List f25998d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f25999e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f26000f;

    /* renamed from: g  reason: collision with root package name */
    public final SerialDescriptor[] f26001g;

    /* renamed from: h  reason: collision with root package name */
    public final List[] f26002h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean[] f26003i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f26004j;

    /* renamed from: k  reason: collision with root package name */
    public final SerialDescriptor[] f26005k;

    /* renamed from: l  reason: collision with root package name */
    public final C3963m f26006l;

    public C2217g(String str, AbstractC2223m abstractC2223m, int i10, List list, C2211a c2211a) {
        AbstractC3557B.c0("serialName", str);
        this.f25995a = str;
        this.f25996b = abstractC2223m;
        this.f25997c = i10;
        this.f25998d = c2211a.f25975b;
        ArrayList arrayList = c2211a.f25976c;
        AbstractC3557B.c0("<this>", arrayList);
        HashSet hashSet = new HashSet(P4.a.n0(AbstractC6583a.H1(arrayList, 12)));
        t.H2(arrayList, hashSet);
        this.f25999e = hashSet;
        int i11 = 0;
        this.f26000f = (String[]) arrayList.toArray(new String[0]);
        this.f26001g = AbstractC2704h0.b(c2211a.f25978e);
        this.f26002h = (List[]) c2211a.f25979f.toArray(new List[0]);
        ArrayList arrayList2 = c2211a.f25980g;
        AbstractC3557B.c0("<this>", arrayList2);
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f26003i = zArr;
        kf.o C32 = q.C3(this.f26000f);
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(C32, 10));
        Iterator it2 = C32.iterator();
        while (it2.hasNext()) {
            y yVar = (y) it2.next();
            arrayList3.add(new C3959i(yVar.f37487b, Integer.valueOf(yVar.f37486a)));
        }
        this.f26004j = AbstractC4268D.k1(arrayList3);
        this.f26005k = AbstractC2704h0.b(list);
        this.f26006l = R4.b.D1(new A(20, this));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f25995a;
    }

    @Override // dh.AbstractC2710l
    public final Set b() {
        return this.f25999e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        Integer num = (Integer) this.f26004j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f25996b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2217g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC3557B.K(a(), serialDescriptor.a()) && Arrays.equals(this.f26005k, ((C2217g) obj).f26005k) && f() == serialDescriptor.f()) {
                int f6 = f();
                for (int i10 = 0; i10 < f6; i10++) {
                    if (AbstractC3557B.K(i(i10).a(), serialDescriptor.i(i10).a()) && AbstractC3557B.K(i(i10).e(), serialDescriptor.i(i10).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f25997c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return this.f26000f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f25998d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        return this.f26002h[i10];
    }

    public final int hashCode() {
        return ((Number) this.f26006l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return this.f26001g[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        return this.f26003i[i10];
    }

    public final String toString() {
        return t.m2(N.D0(0, this.f25997c), ", ", android.gov.nist.core.a.n(new StringBuilder(), this.f25995a, '('), Separators.RPAREN, new Xf.f(22, this), 24);
    }
}

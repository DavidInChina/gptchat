package W;

import D1.C0373t;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class R2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f19603Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f19604Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f19605h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ List f19606i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0373t f19607j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19608k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f19609l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19610m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E0.o0 f19611n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f19612o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f19613p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ Integer f19614q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ List f19615r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ Integer f19616s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0373t c0373t, int i10, int i11, E.A0 a02, E0.o0 o0Var, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f19603Y = arrayList;
        this.f19604Z = arrayList2;
        this.f19605h0 = arrayList3;
        this.f19606i0 = arrayList4;
        this.f19607j0 = c0373t;
        this.f19608k0 = i10;
        this.f19609l0 = i11;
        this.f19610m0 = a02;
        this.f19611n0 = o0Var;
        this.f19612o0 = i12;
        this.f19613p0 = i13;
        this.f19614q0 = num;
        this.f19615r0 = arrayList5;
        this.f19616s0 = num2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        E0.c0 c0Var = (E0.c0) obj;
        List list = this.f19603Y;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            E0.c0.d(c0Var, (E0.d0) list.get(i12), 0, 0);
        }
        List list2 = this.f19604Z;
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            E0.c0.d(c0Var, (E0.d0) list2.get(i13), 0, 0);
        }
        List list3 = this.f19605h0;
        int size3 = list3.size();
        int i14 = 0;
        while (true) {
            i10 = this.f19612o0;
            if (i14 >= size3) {
                break;
            }
            E0.o0 o0Var = this.f19611n0;
            E0.c0.d(c0Var, (E0.d0) list3.get(i14), this.f19610m0.a(o0Var, o0Var.getLayoutDirection()) + ((this.f19608k0 - this.f19609l0) / 2), i10 - this.f19613p0);
            i14++;
        }
        List list4 = this.f19606i0;
        int size4 = list4.size();
        for (int i15 = 0; i15 < size4; i15++) {
            E0.d0 d0Var = (E0.d0) list4.get(i15);
            Integer num = this.f19614q0;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            E0.c0.d(c0Var, d0Var, 0, i10 - i11);
        }
        C0373t c0373t = this.f19607j0;
        if (c0373t != null) {
            List list5 = this.f19615r0;
            int size5 = list5.size();
            for (int i16 = 0; i16 < size5; i16++) {
                Integer num2 = this.f19616s0;
                AbstractC3557B.Z(num2);
                E0.c0.d(c0Var, (E0.d0) list5.get(i16), c0373t.f3302a, i10 - num2.intValue());
            }
        }
        return jf.y.f36177a;
    }
}

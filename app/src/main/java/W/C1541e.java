package W;

import E.AbstractC0429m;
import E.C0421f;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: W.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1541e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f20024Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0.P f20025Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f20026h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f20027i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f20028j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541e(ArrayList arrayList, E0.P p10, float f6, int i10, ArrayList arrayList2) {
        super(1);
        this.f20024Y = arrayList;
        this.f20025Z = p10;
        this.f20026h0 = f6;
        this.f20027i0 = i10;
        this.f20028j0 = arrayList2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        E0.P p10;
        int i10;
        E0.c0 c0Var = (E0.c0) obj;
        List list = this.f20024Y;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            int size2 = list2.size();
            int[] iArr = new int[size2];
            int i12 = 0;
            while (true) {
                p10 = this.f20025Z;
                if (i12 >= size2) {
                    break;
                }
                int i13 = ((E0.d0) list2.get(i12)).f4053Y;
                if (i12 < AbstractC4344b.u0(list2)) {
                    i10 = p10.a0(this.f20026h0);
                } else {
                    i10 = 0;
                }
                iArr[i12] = i13 + i10;
                i12++;
            }
            C0421f c0421f = AbstractC0429m.f3908b;
            int[] iArr2 = new int[size2];
            for (int i14 = 0; i14 < size2; i14++) {
                iArr2[i14] = 0;
            }
            c0421f.b(p10, this.f20027i0, iArr, p10.getLayoutDirection(), iArr2);
            int size3 = list2.size();
            for (int i15 = 0; i15 < size3; i15++) {
                E0.c0.d(c0Var, (E0.d0) list2.get(i15), iArr2[i15], ((Number) this.f20028j0.get(i11)).intValue());
            }
        }
        return jf.y.f36177a;
    }
}

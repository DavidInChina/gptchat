package yh;

import java.util.List;

/* renamed from: yh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6620k extends AbstractC6615i {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f51033Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Iterable f51034h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6620k(int i10, List list) {
        super(0);
        this.f51033Z = i10;
        this.f51034h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f51033Z;
        Iterable iterable = this.f51034h0;
        switch (i11) {
            case 0:
                return (AbstractC6612h) ((List) iterable).get(i10);
            default:
                Rh.d1 d1Var = (Rh.d1) iterable;
                Rh.T0 t02 = (Rh.T0) d1Var.f15812D0.get(i10);
                t02.getClass();
                return new Rh.P0(d1Var, t02.f15729a, t02.f15730b, t02.f15731c, t02.f15732d, t02.f15733e, t02.f15734f);
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f51033Z;
        Iterable iterable = this.f51034h0;
        switch (i10) {
            case 0:
                return ((List) iterable).size();
            default:
                return ((Rh.d1) iterable).f15812D0.size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6620k(Rh.d1 d1Var) {
        super(0);
        this.f51033Z = 2;
        this.f51034h0 = d1Var;
    }
}

package wh;

import Rh.M0;
import Rh.S0;
import Rh.d1;
import java.util.List;

/* renamed from: wh.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6253r extends AbstractC6251p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f48566Z = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final Iterable f48567h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6253r(d1 d1Var) {
        super(0);
        this.f48567h0 = d1Var;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f48566Z;
        Iterable iterable = this.f48567h0;
        switch (i11) {
            case 0:
                return (AbstractC6250o) ((List) iterable).get(i10);
            default:
                d1 d1Var = (d1) iterable;
                S0 s02 = (S0) d1Var.f15811C0.get(i10);
                s02.getClass();
                return new M0(d1Var, s02.f15710a, s02.f15711b, s02.f15712c, s02.f15713d, s02.f15714e, s02.f15715f, s02.f15716g, s02.f15717h, s02.f15718i, s02.f15719j, s02.f15720k, s02.f15721l, s02.f15722m, s02.f15723n, s02.f15724o, s02.f15725p);
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f48566Z;
        Iterable iterable = this.f48567h0;
        switch (i10) {
            case 0:
                return ((List) iterable).size();
            default:
                return ((d1) iterable).f15811C0.size();
        }
    }

    public C6253r(List list) {
        super(0);
        this.f48567h0 = list;
    }
}

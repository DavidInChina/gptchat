package vh;

import Rh.G0;
import Rh.L;
import Rh.d1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f47549Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Iterable f47550h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10, List list) {
        super(0);
        this.f47549Z = i10;
        this.f47550h0 = list;
    }

    public final c I(int i10) {
        int i11 = this.f47549Z;
        Iterable iterable = this.f47550h0;
        switch (i11) {
            case 1:
                return new b((Field) ((List) iterable).get(i10));
            default:
                d1 d1Var = (d1) iterable;
                L l10 = (L) d1Var.f15810B0.get(i10);
                l10.getClass();
                return new G0(d1Var, l10.f15641a, l10.f15642b, l10.f15643c, l10.f15644d, l10.f15645e, l10.f15646f, l10.f15647g);
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        switch (this.f47549Z) {
            case 0:
                return (g) ((List) this.f47550h0).get(i10);
            case 1:
                return I(i10);
            default:
                return I(i10);
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f47549Z;
        Iterable iterable = this.f47550h0;
        switch (i10) {
            case 0:
                return ((List) iterable).size();
            case 1:
                return ((List) iterable).size();
            default:
                return ((d1) iterable).f15810B0.size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d1 d1Var) {
        super(0);
        this.f47549Z = 2;
        this.f47550h0 = d1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Field[] fieldArr) {
        this(1, Arrays.asList(fieldArr));
        this.f47549Z = 1;
    }
}

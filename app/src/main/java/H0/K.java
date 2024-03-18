package H0;

import Pg.C1171d;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import w.C6060g;

/* loaded from: classes2.dex */
public final class K extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public O f6767Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6060g f6768Z;

    /* renamed from: h0  reason: collision with root package name */
    public C1171d f6769h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f6770i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ O f6771j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6772k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f6771j0 = o10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f6770i0 = obj;
        this.f6772k0 |= Integer.MIN_VALUE;
        return this.f6771j0.m(this);
    }
}

package n9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: n9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4725d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4726e f39667Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39668Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4726e f39669h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39670i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4725d(C4726e c4726e, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39669h0 = c4726e;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39668Z = obj;
        this.f39670i0 |= Integer.MIN_VALUE;
        return this.f39669h0.f(null, this);
    }
}

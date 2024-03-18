package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5450N extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44807Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f44808Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44809h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5451O f44810i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44811j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5450N(C5451O c5451o, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44810i0 = c5451o;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44809h0 = obj;
        this.f44811j0 |= Integer.MIN_VALUE;
        return this.f44810i0.g(false, this);
    }
}

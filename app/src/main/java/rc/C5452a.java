package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5452a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44837Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44838Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N.W f44839h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5452a(N.W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44839h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44837Y = obj;
        this.f44838Z |= Integer.MIN_VALUE;
        return this.f44839h0.c(null, this);
    }
}

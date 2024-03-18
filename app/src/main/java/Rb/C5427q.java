package rb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5427q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44725Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44726Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f44727h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5427q(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44727h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44725Y = obj;
        this.f44726Z |= Integer.MIN_VALUE;
        return this.f44727h0.c(null, this);
    }
}

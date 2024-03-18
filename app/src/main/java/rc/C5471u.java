package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* renamed from: rc.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5471u extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44928Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44929Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f44930h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5471u(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44930h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44928Y = obj;
        this.f44929Z |= Integer.MIN_VALUE;
        return this.f44930h0.c(null, this);
    }
}

package rc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rc.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5459h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44879Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5463l f44880Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f44881h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5459h(C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44880Z = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44879Y = obj;
        this.f44881h0 |= Integer.MIN_VALUE;
        return this.f44880Z.c(this);
    }
}

package wc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: wc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6159a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f48296Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6161c f48297Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f48298h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6159a(C6161c c6161c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f48297Z = c6161c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f48296Y = obj;
        this.f48298h0 |= Integer.MIN_VALUE;
        return this.f48297Z.a(this);
    }
}

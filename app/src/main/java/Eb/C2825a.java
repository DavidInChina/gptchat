package eb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: eb.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2825a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2827c f29102Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29103Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2827c f29104h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f29105i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2825a(C2827c c2827c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29104h0 = c2827c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29103Z = obj;
        this.f29105i0 |= Integer.MIN_VALUE;
        return this.f29104h0.b(this);
    }
}

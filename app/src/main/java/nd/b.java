package Nd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public d f12785Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12786Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f12787h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f12788i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f12787h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f12786Z = obj;
        this.f12788i0 |= Integer.MIN_VALUE;
        return this.f12787h0.a(this);
    }
}

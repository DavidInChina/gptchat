package kc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: kc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4233a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37287Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4235c f37288Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37289h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4233a(C4235c c4235c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37288Z = c4235c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37287Y = obj;
        this.f37289h0 |= Integer.MIN_VALUE;
        return this.f37288Z.a(null, null, this);
    }
}

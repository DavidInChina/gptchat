package k4;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: k4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4168j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37012Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4170l f37013Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37014h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4168j(C4170l c4170l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37013Z = c4170l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37012Y = obj;
        this.f37014h0 |= Integer.MIN_VALUE;
        return this.f37013Z.b(null, this);
    }
}

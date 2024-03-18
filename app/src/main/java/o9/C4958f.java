package o9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* renamed from: o9.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4958f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f40996Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4959g f40997Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f40998h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4958f(C4959g c4959g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40997Z = c4959g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40996Y = obj;
        this.f40998h0 |= Integer.MIN_VALUE;
        this.f40997Z.b(null, this);
        return EnumC5000a.f41328Y;
    }
}

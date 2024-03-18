package Lc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class r extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11013Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s f11014Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f11015h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11014Z = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11013Y = obj;
        this.f11015h0 |= Integer.MIN_VALUE;
        Object c10 = this.f11014Z.c(false, this);
        if (c10 == EnumC5000a.f41328Y) {
            return c10;
        }
        String str = (String) c10;
        if (str != null) {
            return new nd.m(str);
        }
        return null;
    }
}

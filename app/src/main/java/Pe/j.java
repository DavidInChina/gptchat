package pe;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;

/* loaded from: classes.dex */
public final class j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f43117Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6410O f43118Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f43119h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f43120i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l f43121j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43122k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43121j0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43120i0 = obj;
        this.f43122k0 |= Integer.MIN_VALUE;
        return this.f43121j0.i(null, this);
    }
}

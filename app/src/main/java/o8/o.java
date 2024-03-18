package o8;

import u8.AbstractRunnableC5866p;
import u8.C5853c;

/* loaded from: classes.dex */
public abstract class o extends AbstractRunnableC5866p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f40970Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, N7.f fVar) {
        super(fVar);
        this.f40970Z = pVar;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void a(Exception exc) {
        if (!(exc instanceof C5853c)) {
            super.a(exc);
        } else if (p.c(this.f40970Z)) {
            super.a(new C4948a(-2, exc));
        } else {
            super.a(new C4948a(-9, exc));
        }
    }
}

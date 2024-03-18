package di;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class s extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f28618e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f28619f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f28620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t tVar, int i10, long j6) {
        super(str, true);
        this.f28618e = tVar;
        this.f28619f = i10;
        this.f28620g = j6;
    }

    @Override // Zh.a
    public final long a() {
        t tVar = this.f28618e;
        try {
            tVar.f28625D0.F(this.f28619f, this.f28620g);
            return -1L;
        } catch (IOException e10) {
            tVar.h(e10);
            return -1L;
        }
    }
}

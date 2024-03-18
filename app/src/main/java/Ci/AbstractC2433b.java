package ci;

import id.AbstractC3557B;
import java.io.IOException;
import ji.AbstractC4122K;
import ji.C4124M;
import ji.C4135j;
import ji.C4144s;

/* renamed from: ci.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2433b implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final C4144s f26664Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f26665Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f26666h0;

    public AbstractC2433b(h hVar) {
        this.f26666h0 = hVar;
        this.f26664Y = new C4144s(hVar.f26683c.f());
    }

    public final void a() {
        h hVar = this.f26666h0;
        int i10 = hVar.f26685e;
        if (i10 == 6) {
            return;
        }
        if (i10 == 5) {
            C4144s c4144s = this.f26664Y;
            C4124M c4124m = c4144s.f36740e;
            c4144s.f36740e = C4124M.f36687d;
            c4124m.a();
            c4124m.b();
            hVar.f26685e = 6;
            return;
        }
        throw new IllegalStateException("state: " + hVar.f26685e);
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f26664Y;
    }

    @Override // ji.AbstractC4122K
    public long g0(C4135j c4135j, long j6) {
        h hVar = this.f26666h0;
        AbstractC3557B.c0("sink", c4135j);
        try {
            return hVar.f26683c.g0(c4135j, j6);
        } catch (IOException e10) {
            hVar.f26682b.l();
            a();
            throw e10;
        }
    }
}

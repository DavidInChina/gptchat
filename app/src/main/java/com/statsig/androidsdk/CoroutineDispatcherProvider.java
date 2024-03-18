package com.statsig.androidsdk;

import Ng.B;
import Ng.Q;
import Sg.u;
import Tg.e;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004\u00a8\u0006\u001c"}, d2 = {"Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "LNg/B;", "component1", "()LNg/B;", "component2", "component3", "main", "default", "io", "copy", "(LNg/B;LNg/B;LNg/B;)Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LNg/B;", "getMain", "getDefault", "getIo", "<init>", "(LNg/B;LNg/B;LNg/B;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CoroutineDispatcherProvider {

    /* renamed from: default  reason: not valid java name */
    private final B f0default;

    /* renamed from: io  reason: collision with root package name */
    private final B f27813io;
    private final B main;

    public CoroutineDispatcherProvider() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CoroutineDispatcherProvider copy$default(CoroutineDispatcherProvider coroutineDispatcherProvider, B b10, B b11, B b12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = coroutineDispatcherProvider.main;
        }
        if ((i10 & 2) != 0) {
            b11 = coroutineDispatcherProvider.f0default;
        }
        if ((i10 & 4) != 0) {
            b12 = coroutineDispatcherProvider.f27813io;
        }
        return coroutineDispatcherProvider.copy(b10, b11, b12);
    }

    public final B component1() {
        return this.main;
    }

    public final B component2() {
        return this.f0default;
    }

    public final B component3() {
        return this.f27813io;
    }

    public final CoroutineDispatcherProvider copy(B b10, B b11, B b12) {
        AbstractC3557B.c0("main", b10);
        AbstractC3557B.c0("default", b11);
        AbstractC3557B.c0("io", b12);
        return new CoroutineDispatcherProvider(b10, b11, b12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoroutineDispatcherProvider)) {
            return false;
        }
        CoroutineDispatcherProvider coroutineDispatcherProvider = (CoroutineDispatcherProvider) obj;
        return AbstractC3557B.K(this.main, coroutineDispatcherProvider.main) && AbstractC3557B.K(this.f0default, coroutineDispatcherProvider.f0default) && AbstractC3557B.K(this.f27813io, coroutineDispatcherProvider.f27813io);
    }

    public final B getDefault() {
        return this.f0default;
    }

    public final B getIo() {
        return this.f27813io;
    }

    public final B getMain() {
        return this.main;
    }

    public int hashCode() {
        int hashCode = this.f0default.hashCode();
        return this.f27813io.hashCode() + ((hashCode + (this.main.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CoroutineDispatcherProvider(main=" + this.main + ", default=" + this.f0default + ", io=" + this.f27813io + ')';
    }

    public CoroutineDispatcherProvider(B b10, B b11, B b12) {
        AbstractC3557B.c0("main", b10);
        AbstractC3557B.c0("default", b11);
        AbstractC3557B.c0("io", b12);
        this.main = b10;
        this.f0default = b11;
        this.f27813io = b12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoroutineDispatcherProvider(B b10, B b11, B b12, int i10, g gVar) {
        this(b10, (i10 & 2) != 0 ? Q.f12904a : b11, (i10 & 4) != 0 ? Q.f12906c : b12);
        if ((i10 & 1) != 0) {
            e eVar = Q.f12904a;
            b10 = u.f16684a;
        }
    }
}

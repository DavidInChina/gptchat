package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3719a extends q {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f35286i;

    /* renamed from: j  reason: collision with root package name */
    l f35287j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3719a(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, 0, i11);
        this.f35286i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f35307b != null;
    }

    public final boolean hasNext() {
        return this.f35307b != null;
    }

    public final void remove() {
        l lVar = this.f35287j;
        if (lVar != null) {
            this.f35287j = null;
            this.f35286i.g(lVar.f35299b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}

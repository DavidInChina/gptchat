package F0;

/* loaded from: classes2.dex */
public final class a extends Bi.c {

    /* renamed from: h  reason: collision with root package name */
    public g f5020h;

    @Override // Bi.c
    public final boolean G0(c cVar) {
        if (cVar == this.f5020h.getKey()) {
            return true;
        }
        return false;
    }

    @Override // Bi.c
    public final Object N0(i iVar) {
        if (iVar == this.f5020h.getKey()) {
            return this.f5020h.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

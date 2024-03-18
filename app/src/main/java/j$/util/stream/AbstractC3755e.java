package j$.util.stream;

/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3755e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f35613a;

    /* renamed from: b  reason: collision with root package name */
    protected int f35614b;

    /* renamed from: c  reason: collision with root package name */
    protected int f35615c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f35616d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3755e() {
        this.f35613a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3755e(int i10) {
        if (i10 >= 0) {
            this.f35613a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public final long count() {
        int i10 = this.f35615c;
        return i10 == 0 ? this.f35614b : this.f35616d[i10] + this.f35614b;
    }
}

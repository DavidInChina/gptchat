package ii;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import ji.AbstractC4122K;
import ji.C4135j;
import ji.v;

/* renamed from: ii.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3586a implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33254Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f33255Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4135j f33256h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f33257i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Closeable f33258j0;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ji.j, ji.K] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ji.j] */
    public C3586a(int i10, boolean z10) {
        this.f33254Y = i10;
        if (i10 != 1) {
            this.f33255Z = z10;
            ?? obj = new Object();
            this.f33256h0 = obj;
            Deflater deflater = new Deflater(-1, true);
            this.f33257i0 = deflater;
            this.f33258j0 = new ci.f((C4135j) obj, deflater);
            return;
        }
        this.f33255Z = z10;
        ?? obj2 = new Object();
        this.f33256h0 = obj2;
        Inflater inflater = new Inflater(true);
        this.f33257i0 = inflater;
        this.f33258j0 = new v((AbstractC4122K) obj2, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f33254Y;
        Closeable closeable = this.f33258j0;
        switch (i10) {
            case 0:
                ((ci.f) closeable).close();
                return;
            default:
                ((v) closeable).close();
                return;
        }
    }
}

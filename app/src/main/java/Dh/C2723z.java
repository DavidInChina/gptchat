package dh;

import fh.C3092s;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2723z {

    /* renamed from: e  reason: collision with root package name */
    public static final long[] f28508e = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f28509a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.n f28510b;

    /* renamed from: c  reason: collision with root package name */
    public long f28511c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f28512d;

    public C2723z(SerialDescriptor serialDescriptor, C3092s c3092s) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        this.f28509a = serialDescriptor;
        this.f28510b = c3092s;
        int f6 = serialDescriptor.f();
        long j6 = 0;
        if (f6 <= 64) {
            this.f28511c = f6 != 64 ? (-1) << f6 : j6;
            this.f28512d = f28508e;
            return;
        }
        this.f28511c = 0L;
        int i10 = (f6 - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((f6 & 63) != 0) {
            jArr[i10 - 1] = (-1) << f6;
        }
        this.f28512d = jArr;
    }
}

package H1;

import android.os.Parcel;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7185a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7186b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7187c;

    public q(Parcel parcel) {
        AbstractC3557B.c0("parcel", parcel);
        byte[] bArr = new byte[parcel.readInt()];
        this.f7185a = bArr;
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        AbstractC3557B.Z(readString);
        this.f7186b = readString;
        this.f7187c = parcel.readLong();
    }
}

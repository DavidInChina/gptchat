package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: b  reason: collision with root package name */
    public static final L f24997b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final U f24998a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.M, java.lang.Object, androidx.datastore.preferences.protobuf.U] */
    public N() {
        U u10;
        U[] uArr = new U[2];
        uArr[0] = C2037w.f25124a;
        try {
            u10 = (U) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            u10 = f24997b;
        }
        uArr[1] = u10;
        ?? obj = new Object();
        obj.f24996a = uArr;
        Charset charset = B.f24959a;
        this.f24998a = obj;
    }
}

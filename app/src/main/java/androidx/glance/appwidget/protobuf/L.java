package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: b  reason: collision with root package name */
    public static final J f25164b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Q f25165a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.glance.appwidget.protobuf.Q, java.lang.Object, androidx.glance.appwidget.protobuf.K] */
    public L() {
        Q q10;
        Q[] qArr = new Q[2];
        qArr[0] = C2060u.f25275a;
        try {
            q10 = (Q) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            q10 = f25164b;
        }
        qArr[1] = q10;
        ?? obj = new Object();
        obj.f25163a = qArr;
        Charset charset = A.f25144a;
        this.f25165a = obj;
    }
}

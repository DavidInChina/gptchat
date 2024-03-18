package bi;

import Wh.x;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final x f26034a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26035b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26036c;

    public h(x xVar, int i10, String str) {
        this.f26034a = xVar;
        this.f26035b = i10;
        this.f26036c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f26034a == x.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f26035b);
        sb2.append(' ');
        sb2.append(this.f26036c);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}

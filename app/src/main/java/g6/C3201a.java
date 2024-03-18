package g6;

import C6.g;
import Wh.y;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Set;

/* renamed from: g6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3201a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f31283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f31284b;

    public /* synthetic */ C3201a(y yVar, Set set) {
        this.f31283a = yVar;
        this.f31284b = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r5.equals("tracestate") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r2.contains(C6.g.f2723i0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        id.AbstractC3557B.b0("value", r6);
        r1.a(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r5.equals("x-datadog-sampling-priority") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r5.equals("x-datadog-parent-id") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r5.equals("X-B3-SpanId") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r5.equals("X-B3-TraceId") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r2.contains(C6.g.f2722h0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        id.AbstractC3557B.b0("value", r6);
        r1.a(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        if (r5.equals("x-datadog-origin") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r2.contains(C6.g.f2720Y) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
        id.AbstractC3557B.b0("value", r6);
        r1.a(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r5.equals("X-B3-Sampled") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r5.equals("x-datadog-trace-id") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r5.equals("traceparent") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2) {
        y yVar = this.f31283a;
        AbstractC3557B.c0("$tracedRequestBuilder", yVar);
        Set set = this.f31284b;
        AbstractC3557B.c0("$tracingHeaderTypes", set);
        AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        yVar.f(str);
        switch (str.hashCode()) {
            case -1682961930:
                break;
            case -1140603879:
                break;
            case -344354804:
                break;
            case 3089:
                if (str.equals("b3")) {
                    if (set.contains(g.f2721Z)) {
                        AbstractC3557B.b0("value", str2);
                        yVar.a(str, str2);
                        return;
                    }
                    return;
                }
                AbstractC3557B.b0("value", str2);
                yVar.a(str, str2);
                return;
            case 304080974:
                break;
            case 762897402:
                break;
            case 1006622316:
                break;
            case 1037578799:
                break;
            case 1767467379:
                break;
            case 1791641299:
                break;
            default:
                AbstractC3557B.b0("value", str2);
                yVar.a(str, str2);
                return;
        }
    }
}

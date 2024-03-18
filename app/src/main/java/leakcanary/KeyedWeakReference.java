package leakcanary;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import hh.C3441i;
import id.AbstractC3557B;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lleakcanary/KeyedWeakReference;", "Ljava/lang/ref/WeakReference;", "", "Ljf/y;", SDPKeywords.CLEAR, "()V", "", "retainedUptimeMillis", "J", "getRetainedUptimeMillis", "()J", "setRetainedUptimeMillis", "(J)V", "", SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "description", "getDescription", "watchUptimeMillis", "getWatchUptimeMillis", "referent", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/lang/ref/ReferenceQueue;)V", "Companion", "hh/i", "leakcanary-object-watcher"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class KeyedWeakReference extends WeakReference<Object> {
    public static final C3441i Companion = new Object();
    private static volatile long heapDumpUptimeMillis;
    private final String description;
    private final String key;
    private volatile long retainedUptimeMillis = -1;
    private final long watchUptimeMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedWeakReference(Object obj, String str, String str2, long j6, ReferenceQueue<Object> referenceQueue) {
        super(obj, referenceQueue);
        AbstractC3557B.d0("referent", obj);
        AbstractC3557B.d0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.d0("description", str2);
        AbstractC3557B.d0("referenceQueue", referenceQueue);
        this.key = str;
        this.description = str2;
        this.watchUptimeMillis = j6;
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j6) {
        heapDumpUptimeMillis = j6;
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        super.clear();
        this.retainedUptimeMillis = -1L;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j6) {
        this.retainedUptimeMillis = j6;
    }
}

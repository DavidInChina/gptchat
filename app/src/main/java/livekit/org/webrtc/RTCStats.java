package livekit.org.webrtc;

import java.util.Map;

/* loaded from: classes2.dex */
public class RTCStats {

    /* renamed from: id  reason: collision with root package name */
    private final String f38540id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j6, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j6;
        this.type = str;
        this.f38540id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append('[');
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (i10 != 0) {
                    sb2.append(", ");
                }
                appendValue(sb2, objArr[i10]);
            }
            sb2.append(']');
        } else if (obj instanceof String) {
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
        } else {
            sb2.append(obj);
        }
    }

    @CalledByNative
    public static RTCStats create(long j6, String str, String str2, Map map) {
        return new RTCStats(j6, str, str2, map);
    }

    public String getId() {
        return this.f38540id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder p10 = android.gov.nist.core.a.p("{ timestampUs: ");
        p10.append(this.timestampUs);
        p10.append(", type: ");
        p10.append(this.type);
        p10.append(", id: ");
        p10.append(this.f38540id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            p10.append(", ");
            p10.append(entry.getKey());
            p10.append(": ");
            appendValue(p10, entry.getValue());
        }
        p10.append(" }");
        return p10.toString();
    }
}

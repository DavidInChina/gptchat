package livekit.org.webrtc;

/* loaded from: classes2.dex */
public class StatsReport {

    /* renamed from: id  reason: collision with root package name */
    public final String f38542id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    /* loaded from: classes.dex */
    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return R.a.t(sb2, this.value, "]");
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d10, Value[] valueArr) {
        this.f38542id = str;
        this.type = str2;
        this.timestamp = d10;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f38542id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i10 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i10 < valueArr.length) {
                sb2.append(valueArr[i10].toString());
                sb2.append(", ");
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }
}

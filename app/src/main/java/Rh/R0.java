package Rh;

/* loaded from: classes2.dex */
public final class R0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15701a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f15702b;

    public R0(String str, Integer num) {
        this.f15701a = str;
        this.f15702b = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R0.class != obj.getClass()) {
            return false;
        }
        R0 r02 = (R0) obj;
        Integer num = this.f15702b;
        Integer num2 = r02.f15702b;
        if (num2 != null) {
            if (num == null || !num.equals(num2)) {
                return false;
            }
            String str = this.f15701a;
            String str2 = r02.f15701a;
            if (str2 != null) {
                if (str != null && str.equals(str2)) {
                    return true;
                }
                return false;
            } else if (str != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode = R0.class.hashCode() * 31;
        String str = this.f15701a;
        if (str != null) {
            hashCode += str.hashCode();
        }
        int i10 = hashCode * 31;
        Integer num = this.f15702b;
        if (num != null) {
            return i10 + num.hashCode();
        }
        return i10;
    }
}

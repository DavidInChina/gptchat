package livekit.org.webrtc;

/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* renamed from: livekit.org.webrtc.Predicate$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static Predicate a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.2
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.a(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate3) {
                    return CC.c(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    if (Predicate.this.test(obj) && predicate2.test(obj)) {
                        return true;
                    }
                    return false;
                }
            };
        }

        public static Predicate b(final Predicate predicate) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.3
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate2) {
                    return CC.a(this, predicate2);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate2) {
                    return CC.c(this, predicate2);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        public static Predicate c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.1
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.a(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate3) {
                    return CC.c(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    if (!Predicate.this.test(obj) && !predicate2.test(obj)) {
                        return false;
                    }
                    return true;
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t10);
}

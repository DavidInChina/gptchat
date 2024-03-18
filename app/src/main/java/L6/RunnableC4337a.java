package l6;

/* renamed from: l6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4337a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f37841Y;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        this.f37841Y = true;
        notifyAll();
    }
}

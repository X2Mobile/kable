package com.juul.kable

import kotlinx.coroutines.flow.Flow

public actual enum class Reason {
    // Not implemented.
}

public actual class Device

internal actual val bluetoothAvailability: Flow<Bluetooth.Availability> = jvmNotImplementedException()

internal actual val bluetoothBondedDevices: Flow<List<Device>> = jvmNotImplementedException()

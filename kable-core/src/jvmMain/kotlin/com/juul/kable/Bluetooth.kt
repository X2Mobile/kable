package com.juul.kable

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

public actual enum class Reason {
    // Not implemented.
}

public actual class Device

// This is not a proper implementation, but this property is deprecated, so...
internal actual val bluetoothAvailability: Flow<Bluetooth.Availability> = flowOf(Bluetooth.Availability.Available)

internal actual val bluetoothBondedDevices: Flow<List<Device>> = flowOf()
